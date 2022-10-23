/*  Create a class Book with the fields title, author and price. Make a constructor 
which initialize all the fields. Add a behavior with read() and just print a 
message “Reading Paper book”. */

open Book{
  val title: String
  val author: String
  var price: Float 
  constructor(tit: String, auth: String, prc: Float){
    title = tit
    author = auth
    price = prc
  }
  open fun read(){
    print("Reading Paper book")
  }
}

/*  Create a subclass EBook from Book, include additional attribute filetype as 
String. (ex: pdf, epub, kindle etc.,). Override read() method and print the 
message as “Read from Electronic Device”.  */

open EBook:Book {
  var fileType: String
  constructor(title: String, auth:String, price: Float):super(title, auth, price)
  constructor(title: String, auth:String, price: Float, fType: String):super(title, auth, price){
    fileType = fType
  }
  override fun read(){
    print("Read from Electronic Device")
  }

}
/*Write a Test class. Create object for Book and EBook. Make use of getters and 
setters.
 */
fun main(args: Array<String>) {
  val book1 = Book('title1', 'author1', 30)
  val = book2 = EBook('title2', 'author2', 15, 'pdf')

  book1.read()
  book2.read()
}