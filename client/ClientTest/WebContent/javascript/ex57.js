//ex57.js

//브라우저 API(BOM, DOM)에서는 별로 사용될 일이 없는 기능들..
//react, vue, angular, backbone

//ES6 이후 문법

//구조 분해 할당, Destructuring
// - 배열 or 객체를 좀 더 쉽게 다루는 도구
// - 배열의 요소나 객체의 프로퍼티를 분해해서 각각의 개별 변수에 옮겨 담는 기술(표현식)

var list = [ 10, 20 ];
var a, b;

a = list[0];
b = list[1];

console.log(a);
console.log(b);


var c, d;
[c, d] = [ 100, 200 ];

console.log(c);
console.log(d);

var list = [ 1000, 2000 ];
var e, f;

[e, f] = list;

console.log(e);
console.log(f);


var a, b, c;
// [a, b, c] = [ 100, 200, 300 ];
// [a, b, c] = [ 100, 200, 300, 400, 500 ];
// [a, b, c] = [ 100, 200 ];
[a, b, ...c] = [ 100, 200, 300, 400, 500 ]; //c는 또 배열이 됨.

console.log(a, b, c);


var [a, b] = [10, 20];
console.log(a, b);

var [a, b, c=0] = [10, 20]; //초기값
console.log(a, b, c);

var a = 10;
var b = 20;

[a, b] = [b, a]; //swap
console.log(a, b);

function f1() {
    var score = [];
    score.push(100);
    score.push(90);
    score.push(80);
    return score;
}

// var list = f1(); //배열로 반환
// list[0] //국영수 접근

var [kor, eng, math] = f1();
console.log(kor, eng, math);

//--------------------------------------------------------------- 배열 구조 분해 할당

//--------------------------------------------------------------- 객체 구조 분해 할당

// let hong = {
//     name: "홍길동",
//     age: 20
// };

// let name = hong.name;
// let age = hong.age;

// console.log(name, age);

let hong = {
    name: "홍길동",
    age: 20
};

let {name, age} = hong;

console.log(name, age);


//전개 연산자, Spread Operator
var list = [100, 200, 300];

console.log(Math.max(100, 200, 300));
console.log(Math.max(...list)); //Spread Operator

var a1 = [1, 3, 5, 7, 9];
var a2 = [2, 4, 6, 8, 10];
var a3 = [...a1, ...a2]; //Spread + Merge

a3.sort((a, b) => a - b); //자바와 동일
console.log(a3.toString());