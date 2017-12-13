import $ivy.`com.lihaoyi::scalatags:0.6.7`
import scalatags.Text.all._
println(a("Hello", href := "http://www.google.com").render)
