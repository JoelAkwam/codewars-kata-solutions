function getMiddle(s){
    len = s.length
    if(len%2 === 0){
        let me = len/2;
        return s[me-1]+s[me];
    }
    else{
      let mo = Math.floor(len/2);
      return s[mo];
    }
}
