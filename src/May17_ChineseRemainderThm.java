public class May17_ChineseRemainderThm {
    public static void main(String[] args) {
        // chinese remainder theorem / remainder theorem / euler's remainder theorem
        // https://www.geeksforgeeks.org/chinese-remainder-theorem-set-1-introduction/
        // X =  a1(mod m1)
        // X =  a1(mod m2)
        // X =  a1(mod m3)
        // a1 - remainder
        // We have to find X

        // X=(summation of (ai*Mi*Mi^(-1))) mod M
        // where M=(Product of Mi)/small I/P

        // NUM  3   4   5
        // REM  2   3   1
        // Mi=M/mi
        // M1*M1^(-1)=1 mod m

        // M=3*4*5 = 60
        // M1=60/3=20
        // M2=60/4=15
        // M3=60/5=12
    }
}
