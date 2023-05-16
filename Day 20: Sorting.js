'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const n = parseInt(readLine().trim(), 10);

    const a = readLine().replace(/\s+$/g, '').split(' ').map(aTemp => parseInt(aTemp, 10));

    // Write your code here
   let total = 0
    for(let i = 0;i<a.length;i++){
        for(let j = 0;j< a.length-1;j++){
            if(a[j]>a[j+1]){
                let temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                total++                
            }
        }
    }
    let last = a.pop()
    console.log(`Array is sorted in ${total} swaps.`)
    console.log(`First Element: ${a[0]}`)
    console.log(`Last Element: ${last}`)
}
