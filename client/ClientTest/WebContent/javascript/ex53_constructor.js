//ex53_constructor.js

//생성자 함수(= 클래스 역할)
// - 함수
// - 목적 : 객체 생성 용도 -> 전용 함수
// - 표기법(대문자로 시작 -> 파스칼 표기)

var user = {
    name: "홍길동",
    age: 20,
    hello: function() {
        console.log(this.name);
    }
};

//일반 함수
function test() {
    console.log(this);
}

//생성자 함수
function User(name, age) {
    //생성자 함수내의 this는 window 객체가 아니라 향후 생성될 객체를 참조하는 역할
    this.name = name; //프로퍼티 추가
    this.age = age;

    this.hello = function() {
        console.log(this.name);
    }
}

//생성자 함수는 호출할 때 성격이 결정된다.
test(); //일반 함수 호출

User("홍길동", 20); //일반 함수 호출

var hong = new User("홍길동", 20); //생성자 함수 호출(*****************************)
console.log(hong.name);
console.log(hong.age);
hong.hello();

var lee = new test();

console.clear();

//객체 == 프로퍼티 집합

for (var p in hong) {
    console.log(p);
}

console.log("-----------------");

for (var p in lee) {
    console.log(p);
}

console.log("-----------------");


var o1 = new Object();
var o2 = new Date();
var o3 = new User("홍길동", 20);
var o4 = []; //new Array();

console.log(typeof o1);
console.log(typeof o2);
console.log(typeof o3);
console.log(typeof o4);

console.clear();

//객체는 모두 object 형이다. -> 구분이 안된다. -> 생성자 함수를 가지고 구분한다.
console.log(o1.constructor.toString());
console.log(o2.constructor.toString());
console.log(o3.constructor.toString());
console.log(o4.constructor.toString());



