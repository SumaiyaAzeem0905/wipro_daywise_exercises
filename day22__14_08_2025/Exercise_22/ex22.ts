class Stack<T> {
    private items: T[] = [];

    push(item: T): void {
        this.items.push(item);
    }

    pop(): T | undefined {
        return this.items.pop();
    }

    peek(): T | undefined {
        return this.items.length > 0 ? this.items[this.items.length - 1] : undefined;
    }
}

let numberStack = new Stack<number>();
numberStack.push(10);
numberStack.push(20);
numberStack.push(30);

console.log("Top element:", numberStack.peek()); 
console.log("Popped element:", numberStack.pop()); 
console.log("Top element after pop:", numberStack.peek()); 

let stringStack = new Stack<string>();
stringStack.push("Apple");
stringStack.push("Banana");

console.log("Top element:", stringStack.peek()); 
