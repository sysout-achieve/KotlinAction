data class User(val id:Int, var name:String, var address:String)
class UserExample(val id:Int, var name:String, var address:String)

fun main() {
    var noDataUser1 = UserExample(1,"user1", "user1 addr")
    var noDataUser2 = UserExample(1,"user1", "user1 addr")
    var processed2 = hashSetOf(noDataUser1)        //객체를 hashSet집합에 user1객체 넣음
    //같은 값으로 생성된 새로운 객체 비교 --> false 반환 (참조 비교를 하기 때문)
    println("데이터 클래스가 아닌경우  : ${processed2.contains(noDataUser2)}")

    var user1 = User(1,"user1", "user1 addr")
    var user2 = User(1,"user1", "user1 addr")
    var user3 = User(2,"user1", "user1 addr")

    var processed = hashSetOf(user1)        //객체를 hashSet집합에 user1객체 넣음
    //같은 값으로 생성된 새로운 객체로 동등성 비교 --> true 반환 (참조 비교가 아닌 동등성 비교임을 확인)
    println(processed.contains(user2))
    // 하나라도 다른 값이 존재하는 경우 false 반환
    println(processed.contains(user3))

    println(processed.contains(user1.apply { name = "user2" }))

}