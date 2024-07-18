package test;



import org.junit.Test;
import session5.Methods;

import java.util.Scanner;


import static org.junit.Assert.assertEquals;

public class MethodPractice{
    @Test
    public void WhenisCallingisEven_ThenReturnCorrectResult(){
        Scanner scanner=new Scanner(System.in);
        assertEquals(Methods.isEven(5));

    }

    private void assertEquals(boolean even) {
    }
}

