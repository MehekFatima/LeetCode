/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
   if(nums.length==0)
       return init;
    let val = init;
    for (const num of nums) {
        val = fn(val,num); 
    }

    return val;
}



