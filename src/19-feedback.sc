/*
 * The Amazon website has a question and answer feature on product detail pages.
 * When a customer submits a question, the seller, owners of the product
 * and reviewers are asked the question through email. We can solicit sellers 30 times a day,
 * but owners and reviewers only fortnightly.
 *
 *
 * The task is to write the part of the service that decides which customers to solicit,
 * given we have a question that needs an answer. There are generally data sources available
 * for the information you may need to make the determination.
 */


case class Question(productId: Int, question: String)

object UserType extends Enumeration {
    val Owner, Reviewer, Seller = Value
}

case class User(id: Int, name: String, userType: UserType, email: String)

trait PurchaseDatabase {
    def getUser(productId: Int): List[User]
}

trait ContactHistoryDatabase {
    def getNumberOfEmailsSent(userId: Int): Int
}

trait Config {
    lazy val contactSellersPerDay = sellers.contact // 30
    lazy val contactOwnerPerDay = sellers.contact // once every two weeks
    lazy val contactReviewerPerDay = sellers.contact // once every two weeks
}

class Contact(location: String) {
    def sellers(): Int
}

class Decider(purchaseDatebase: PurchaseDatabase, contactHistoryDatabase: ContactHistoryDatabase, contact: Contact) extends Config {
    def usersToContact(question: Question): List[User] ={
        val numberOfSellersAllowed = contact.sellers
        // same for reviewers and owners

        val usersForProduct = purchaseDatabase.getUser(question.productId) // list of users associated

        val allowedUsers = usersForProduct filter { user =>
            val numberOfTypesContacted = contactHistoryDatabase.getNumberOfEmailsSent(user.id)
        // match based on type
            numberOfTypesContacted < numberOfSellersAllowed
        }

        allowedUsers
    }

}


