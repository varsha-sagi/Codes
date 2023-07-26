class Animal:
    def make_sound(self):
        print("The animal makes a sound")
class Dog(Animal):
    def make_sound(self):
        print("The dog barks")
class Cat(Animal):
    def make_sound(self):
        print("The cat meows")
def animal_sound_in_zoo(x):
    x.make_sound()
dog=Dog()
cat=Cat()
animal_sound_in_zoo(dog)
animal_sound_in_zoo(cat)
