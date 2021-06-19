//ex52_object.js

/*

객체, Object
- 중요(****************)

1. 내장 객체
    - Array, Math, Date, RegExp 등..
2. BOM 객체
    - window, document, form, text, button 등..
3. DOM 객체
    - 모든 태그(Element), attribute, text, comment 등..
4. 사용자 정의 객체(BOM ~ ES6)
    - JavaScript는 클래스를 선언할 수 없다. > 내가 원하는 모양의 객체를 생성할 수 없다.
    - JavaScript는 ES6에서 class 개념을 도입했다. > 실체는 여전히 class는 없다. > 겉으로 구현
    - 클래스 선언 > 객체 생성 : 유사 행동(***)

*/

//사용자 정의 객체 만들기
// 붕어빵틀없이 붕어빵 만들기
// 클래스없이 객체 만들기

//사용자 정의 객체 만드는 방법
//1. Object 클래스 사용 -> Object 생성자 함수 사용(*****)
//2. {} : 객체 리터럴 표기법 사용

//자바에서 클래스
// class User {
//     public String name;
//     public int age;
//     public String address;
// }

// User hong = new User();
// hong.name = "홍길동";
// hong.age = 20;
// hong.address = "서울시";

console.clear();

//JavaScript - Object 클래스 사용
//키워드 변수 = 객체생성연산자 생성자();
var hong = new Object(); //생성자 함수(*****)
console.log(100);
console.log(hong);
console.log(typeof hong);

console.clear();

var hong = new Object(); //객체 생성 -> 무소유 순수 객체

for (var p in hong) {
    console.log(p);
}

hong.name = "홍길동"; //프로퍼티 생성하는 방법
console.log(hong.name);

hong.age = 20;
console.log(hong.age);

hong.address = "서울시";
console.log(hong.address);

for (var p in hong) {
    console.log(p);
}


var lee = new Object();

lee.name = "이순신";
lee.age = 30;
lee.address = "경기도";

console.log(lee.toString());
console.clear();


for (var p in lee) {
    console.log(p, lee[p]);
}

//프로퍼티 표현 방법
//1. 멤버 접근 연산자
//2. 인덱서
console.log(lee.name); //편하고, 가독성 좋음
console.log(lee["name"]); //불편하지만 조작성 좋음


//객체 만들기
var s1 = new Object();

s1.name = "홍길동";
s1.kor = 100;
s1.eng = 90;
s1.math = 80;


//객체 만들기
var s2 = { name: "이순신", kor: 90, eng: 80, math: 70 };

var s2 = { 
    name: "이순신", 
    kor: 90, 
    eng: 80, 
    math: 70 
};

console.log(s2.name);
console.log(s2.kor);

s2.gender = "남자";
console.log(s2.gender);

var s3 = {};
s3.name = "하하하";

var s4 = { name: "호호호" }; //초기화
s4.kor = 99; //초기화 & 수정(조작)

delete s4.name; //프로퍼티 삭제
console.log(s4.name); //undefined

console.clear();

var hong = new Object();

hong.name = "홍길동";

hong.hello = function() {
    console.log("안녕하세요. 저는 "+ this.name +"입니다.");
};

hong.hello();

//node.js -> BOM, DOM 지원 환경X
function test() {
    console.log(this.toString()); //this??
}

// test();


var lee = {
    name: "이순신",
    age: 20,
    hello: function() {
        console.log("안녕하세요. " + this.name);
    }
};

lee.hello();


var hong = {
    name: "홍길동",
    age: 20,
    // address: "서울시 강남구 역삼동 20번지",
    // sido:
    address: {
        sido: "서울시",
        gugun: "강남구",
        dong: "역삼동",
        bunji: "20번지"
    },
    job: ["학생", "알바생"]
};

console.log(hong.address.sido);
console.log(hong["address"]["gugun"]);
console.log(hong.job[0]);
console.log(hong.job[1]);







