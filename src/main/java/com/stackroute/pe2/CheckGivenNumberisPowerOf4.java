package com.stackroute.pe2;

public class CheckGivenNumberisPowerOf4 {
    //check given number is power of 4 or not
    public boolean GivenNumberisPower0f4ornot(int number)
    {
        //check is odd or not
        if(number%2!=0)
        {
            return false;
        }
        else
        {
          for(int i=0;i<=number/2;i++)
          {
              //calculate power of number
              if(Math.pow(4,i)==number)
              {
                  return true;
              }
          }
          return false;
        }

    }
}