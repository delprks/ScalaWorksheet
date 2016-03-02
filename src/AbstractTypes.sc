class Food

abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food

class Cow extends Animal {
  type SitableFood = Grass
  override def eat(food: Grass) {}
}
