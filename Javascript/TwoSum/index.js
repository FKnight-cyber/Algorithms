const twoSum = function(nums, target) {
    
    const hashtable = {}
    
    for(let i = 0; i < nums.length;i++){
        hashtable[nums[i]] = i;
    }
    
    for(let i = 0; i < nums.length;i++){
        const ans = target - nums[i];
        if(hashtable[ans] && i !== hashtable[ans]){
            return [i,hashtable[ans]]
         }
    }
};