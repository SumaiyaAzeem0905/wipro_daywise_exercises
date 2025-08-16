class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

let numberBox = new Box<number>(123);
let stringBox = new Box<string>("Hello World");
let booleanBox = new Box<boolean>(true);

console.log("Number Box Value:", numberBox.getValue());
console.log("String Box Value:", stringBox.getValue());
console.log("Boolean Box Value:", booleanBox.getValue());
