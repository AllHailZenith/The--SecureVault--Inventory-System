The attributes are private because the object's data should not be directly changed from outside the class. The getters are public so other classes can safely access the information. This protects the object's state and prevents accidental changes.

I used super(itemName, itemValue) to call the VaultItem constructor and initialize the superclass attributes. Another way would be to make the superclass attributes protected, but using private with a constructor is more secure because subclasses cannot directly change the data.

If a FragileItem has an invalid value, the super() call triggers the exception from VaultItem. This is a good approach because the validation is kept in one place instead of having to duplicate the same check in every subclass.

Selection Sort has a Worst-Case Time Complexity of O(n²) because it compares elements using nested loops. With 10 items, there are roughly 45 comparisons. With 20 items, there are roughly 190 comparisons. Therefore, doubling the number of items results in about four times as many comparisons.