package KBC;

import java.util.Random;
import java.util.Scanner;

public class BSH_Koun_Banega_Crorepatti {
    public BSH_Koun_Banega_Crorepatti() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Koun Banega carorepatti...\n");
        int Money = 0;
        boolean IsCorrect = true;
        int[] m1 = new int[20];
        int[] v1 = new int[20];
        Scanner a = new Scanner(System.in);
        Random a1 = new Random();
        int[] Price = new int[]{1000, 2000, 3000, 5000, 10000, 20000, 40000, 80000, 160000, 320000, 640000, 1250000, 2500000, 5000000, 7500000, 10000000, 70000000};

        int i;
        int n;
        String z;
        for(i = 0; i < 8; ++i) {
            if (!IsCorrect) {
                System.out.println("Sorry Your Answer is Wrong So Please Leave !");
                break;
            }

            n = a1.nextInt(1, 10);
            if (m1[0] != n && m1[1] != n && m1[2] != n && m1[3] != n && m1[4] != n && m1[5] != n && m1[6] != n) {
                BSH.Random(n);
                if (n == 1) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("A") && !z.equals("a")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 2) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("A") && !z.equals("a")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 3) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("C") && !z.equals("c")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 4) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("B") && !z.equals("b")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 5) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("B") && !z.equals("b")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 6) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("A") && !z.equals("a")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 7) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("D") && !z.equals("d")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 8) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("A") && !z.equals("a")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 9) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("C") && !z.equals("c")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                if (n == 10) {
                    System.out.println("Enter the Answer in A to D : ");
                    z = a.next();
                    if (!z.equals("D") && !z.equals("d")) {
                        IsCorrect = false;
                    } else {
                        System.out.println("Congratulation You won Rs " + Price[i]);
                        Money = Price[i];
                    }
                }

                m1[i] = n;
                if (Price[i] == 10000) {
                    System.out.println("You Won Rs 10000 Please Collect your Money...");
                }
            } else {
                --i;
            }
        }

        if (IsCorrect) {
            for(i = 8; i < Price.length; ++i) {
                if (!IsCorrect) {
                    System.out.println("Sorry Your Answer is Wrong So Please Leave !");
                    break;
                }

                n = a1.nextInt(11, 20);
                if (v1[8] != n && v1[9] != n && v1[10] != n && v1[11] != n && v1[12] != n && v1[13] != n && v1[14] != n && v1[15] != n && v1[16] != n) {
                    BSH.Random2(n);
                    if (n == 11) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("A") && !z.equals("a")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 12) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("A") && !z.equals("a")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 13) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("D") && !z.equals("d")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 14) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("C") && !z.equals("c")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 15) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("B") && !z.equals("b")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 16) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("A") && !z.equals("a")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 17) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("A") && !z.equals("a")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 18) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("C") && !z.equals("c")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 19) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("D") && !z.equals("d")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    if (n == 20) {
                        System.out.println("Enter the Answer in A to D : ");
                        z = a.next();
                        if (!z.equals("B") && !z.equals("b")) {
                            IsCorrect = false;
                        } else {
                            System.out.println("Congratulation You won Rs " + Price[i]);
                            Money = Price[i];
                        }
                    }

                    v1[i] = n;
                    if (Price[i] == 320000) {
                        System.out.println("You Won Rs 320000 Please Collect your Money...");
                    }
                } else {
                    --i;
                }
            }
        } else {
            System.out.println("Thank You For Coming .");
        }

        if (Money == 70000000) {
            System.out.println("You Won Rs 7 CRORE Please Collect your Money...");
        }

    }
}
