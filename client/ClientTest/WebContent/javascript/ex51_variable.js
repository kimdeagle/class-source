//ex51_variable.js
/*

변수 선언
1. var
    - BOM ~ DOM ~ ES6
    - function scoped
    - 중복 선언 가능(정말 주의!!!!!)
    - 상수 선언 불가능

2. let
    - ES6
    - block scoped
    - 중복 선언 불가능
    - 변수 선언
    
    3. const
    - ES6
    - block scoped
    - 중복 선언 불가능
    - 상수 선언

*/

var a = 10;
var a = 20;

console.log(a);

function m1() {
    var b = 30;
    var b = 40;
    console.log(b);
}

m1();


//전역 변수 i 중복 선언
for (var i=0; i<10; i++) {
    console.log(i);
}

for (var i=0; i<20; i++) {
    console.log(i);
}

console.clear();

let b = 10;
console.log(b);

// let b = 20; //Identifier 'b' has already been declared
// console.log(b);

if (true) {
    let c = 20;
    console.log(c);
}

// console.log(c);

const d = 100;
console.log(d);

// d = 200; //Uncaught TypeError: Assignment to constant variable.
// console.log(d);

console.clear();

//** let보다 const를 사용하는 것을 권장

let list1 = [ 100, 200, 300 ];
const list2 = [ 100, 200, 300 ];

// list1 = [ 400, 500, 600 ];
// console.log(list1);

// list2 = [ 400, 500, 600 ];
// console.log(list2);

list1.push(400);
console.log(list1);

list2.push(400);
console.log(list2);


// var vs (let & const)
// - 이전 수업 : var
// - 이후 수업 : var & let & const
