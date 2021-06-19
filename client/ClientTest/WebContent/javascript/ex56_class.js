//ex56_class.js

class User {
    
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    //프로퍼티(C#, JavaScript ES6) -> 내부적으로 메서드, 대외적으로 변수처럼 사용
    get getName() {
        return this.name;
    }

    set setName(name) {
        this.name = name;
    }

}

let hong = new User("홍길동", 20);

console.log(hong.getName);

hong.setName = "아무개";
console.log(hong.getName);


class Student {
    constructor(name, age) {
        //멤버 변수명을 _로 시작한다.
        // - _변수는 private 취급
        this._name = name;
        this._age = age;
    }

    //getter, setter는 변수명과 동일하게 만든다.(_빼고)
    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

}

let s1 = new Student("홍길동", 20);

console.log(s1.name); //getter 메서드

s1.name = "아무갱"; //setter 메서드
console.log(s1.name);
