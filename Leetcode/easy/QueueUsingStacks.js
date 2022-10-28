// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
// Amortized O(1) runtime

const MyQueue = function () {
    this.input = [];
    this.output = [];
};

MyQueue.prototype.push = function (x) {
    this.input.push(x);
};

MyQueue.prototype.pop = function () {
    this.peek();
    return this.output.pop();
};

MyQueue.prototype.peek = function () {
    if (this.output.length === 0) {
        while (this.input.length !== 0) {
            this.output.push(this.input.pop());
        }
    }
    return this.output[this.output.length - 1];
};

MyQueue.prototype.empty = function () {
    return this.input.length === 0 && this.output.length === 0;
};