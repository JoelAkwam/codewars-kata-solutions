function findShort(s) {
  var word = s.split(" ");

  var length = [];
  for (var i = 0; i < word.length; i++) {
    length[i] = word[i].length;
  }

  var lowestNum = length[0];
  for (var j = 0; j < length.length; j++) {
    if (length[j] < lowestNum) {
      lowestNum = length[j];
    }
  }

  return lowestNum;

}
