var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(123);
var stringBox = new Box("Hello World");
var booleanBox = new Box(true);
console.log("Number Box Value:", numberBox.getValue());
console.log("String Box Value:", stringBox.getValue());
console.log("Boolean Box Value:", booleanBox.getValue());
