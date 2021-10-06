var threeSum = function (nums) {
  const triplets = new Set(),
    res = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length; i++) {
    if (nums[i - 1] == nums[i]) {
      continue;
    }
    if (nums[i] > 0) {
      break;
    }
    const pmap = new Map();
    for (let j = i + 1; j < nums.length; j++) {
      if (j !== i) {
        const sum = nums[i] + nums[j];
        if (pmap.has(0 - sum)) {
          const key = [nums[i], nums[j], 0 - sum].sort().toString();
          if (!triplets.has(key)) {
            res.push([nums[i], nums[j], 0 - sum]);
            triplets.add(key);
          }
        } else {
          pmap.set(nums[j], j);
        }
      }
    }
  }
  return res;
};
var threeSum = function (nums) {
  nums.sort((a, b) => a - b);
  const res = [];
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > 0) break;
    if (nums[i] === nums[i - 1]) continue;
    let left = i + 1,
      right = nums.length - 1;
    while (left < right) {
      const sum = nums[i] + nums[left] + nums[right];
      if (sum == 0) {
        res.push([nums[i], nums[left], nums[right]]);
        while (nums[left] == nums[++left]);
        while (nums[right] == nums[--right]);
      } else {
        sum > 0 ? right-- : left++;
      }
    }
  }

  return res;
};
