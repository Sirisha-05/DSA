/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let p=init;
    for(let i=0;i<nums.length;i++){
        p=fn(p,nums[i]);
    }
    return p;
};