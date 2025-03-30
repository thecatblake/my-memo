package bitcoin.field;


case class FieldElement(val num: Int, val prime: Int):
    if num >= prime | num < 0 then
        sys.error("%d not in field range 0 to %d" format (num, prime - 1));

    def +(that: FieldElement): FieldElement = 
        if prime != that.prime then 
            sys.error("Cannot add two numbers in different fields.");
        FieldElement((num + that.num) % prime, prime);

    def -(that: FieldElement): FieldElement =
        if prime != that.prime then 
            sys.error("Cannot subtract two numbers in different fields.");
        FieldElement((prime + (num - that.num)) % prime, prime)

    def *(that: FieldElement): FieldElement =
        if prime != that.prime then
            sys.error("Cannot multiply two numbers in different fields.");
        FieldElement((num * that.num) % prime, prime)
