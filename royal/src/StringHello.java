 String str1="Hello";
   String str2="Hello";
   String str3=new String("Hello");
        System.out.println(str1 == (str2));
        //str1 == str2 doğrudur, çünki həm str1, həm də str2 sətir hovuzunda eyni sətir literalına istinad edir.
        System.out.println(str1 == (str3));
      //str1 == str3 yanlışdır, çünki str3 sətir hovuzunda
      // "Salam" hərfi sətirindən ayrı olan new istifadə edərək yaradılmış fərqli String obyektinə istinad edir.
