//ex54_function.js

/*

JavaScript 함수
- "함수는 1급 객체이다."
- first class citizen
- first class object
- 함수를 객체처럼 취급이 가능하다.(***) -> 데이터(값)처럼 취급할 수 있다.

1. 함수를 변수나 데이터 구조에 담을 수 있다.(저장할 수 있다.)
2. 함수를 매개변수에 전달할 수 있다.
3. 함수를 반환값으로 사용할 수 있다.

*/

var m1;

function f1() {
    console.log("f1");
}


console.log(typeof m1); //undefined
console.log(typeof f1); //function
console.log(typeof f1()); //undefined

//변수 = 함수
m1 = f1; //함수가 정의된 위치의 주소값을 복사한다.

console.log(typeof m1); //function

m1(); //f1


m1 = function() {
    console.log(100);
};

m1(); //100


function f2() {
    console.log("f2");
}

function f3() {
    console.log("f3");
}

function f4(aaa) {
    aaa();
}

f4(f2);
f4(f3);

function test() {
    console.log(100);
}

function test2() {
    console.log(200);
}

// setInterval(test2, 1000);


function f5() {
    return f3;
}

f5()();


//익명함수 호출하는 방법(변수 사용 없이)
(function() {
    //지역을 만들기 위한 패턴
    //모두 지역변수(함수 안에서 만들었기 때문에)
    var a = 10;
    let b = 20;
    const c = 30;
    console.log("익명함수");
})();





