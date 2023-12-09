/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const filteredArr=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i))
          filteredArr.push(arr[i]);
    }
     return filteredArr;
};

function arr(){
let arr = [0,10,20,30];
}

function fn(element,index){
    return element>10;
}
