public int triangle(int rows) {
  if(rows == 0) return 0;
    return rows + triangle(rows - 1);
}
public int fibonacci(int n) {
  if(n == 0 || n == 1) return n;
  return fibonacci(n-1) + fibonacci(n-2);
}
public int countHi(String str) {
  if(str.length() < 2) return 0;
  return countHi(str.substring(1))+(str.substring(0,2).equals("hi") ? 1 : 0);
}
public int sumDigits(int n) {
  if(n/10 == 0) return n;
  return n%10 + sumDigits(n/10);
}
public int factorial(int n) {
  if(n <= 1) return 1;
  return n * factorial(n-1);
}
public int count8(int n) {
  if(n <= 0) return 0;
  return (n%10 == 8 ? 1 : 0) + (n%100 == 88 ? 1 : 0) + count8(n/10);
}
public int powerN(int base, int n) {
  if(n == 0) return 1;
  return base * powerN(base,n-1);
}
public int bunnyEars(int bunnies) {
  if(bunnies == 0) return 0;
  return 2 + bunnyEars(bunnies-1);
}
