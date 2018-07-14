function songDecoder(song){
    var rm = "WUB";
    var org = '';
    var parts = song.split(rm);
      for (i = 0; i < parts.length; ++i) {
        if (parts[i] != ''){
          org = org + ' ' + parts[i];
        }
    }
    org = org.trim();
    return org;
}
