function expandedForm(num) {
  var str = num.toString();
  var nums = [];
  var mult = 1;

  for(var a = 1; a <= str.length; a++){
    var digit = str[str.length - a]

    digit>0 && nums.unshift(digit * mult)

    mult *= 10;
  }
  return nums.join(' + ');
}
