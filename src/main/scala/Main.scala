import scala.jdk.CollectionConverters._

object Main extends App {
  val businessFields = Map(
    "name" -> "string",
    "code" -> "string",
    "employee_group_guid" -> "string",
    "account_no" -> "string",
    "business_guid" -> "string",
    "person_guid" -> "string",
    "employment_type" -> "string"
  )

  val businessKeyFields = Map("employee_guid" -> "string")

  val businessCompositeFields =
    Map("properties" -> "array<struct<name:string, value:string>>")

//  val sqlInit = txt.test.render(businessKeyFields.asJava,
//    businessFields.asJava,
//    businessCompositeFields.asJava)
//
//  println(sqlInit)

    html.Hello.render("Jake")

}