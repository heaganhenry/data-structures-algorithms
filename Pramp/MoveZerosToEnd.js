// Given a static-sized array of integers arr, move all zeroes in the array to the end of the array. You should preserve the relative order of items in the array.

function moveZerosToEnd(array){
    let write = 0;
    for (let read = 0; i < array.length; read++){
        if (array[read] != 0){
            [array[write], array[read]] = [array[read], array[write]];
            write++;
        }
    }
    return array;
}