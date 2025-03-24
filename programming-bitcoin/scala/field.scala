package bitcoin.field;


case class FieldElement(val num: Int, val prime: Int):
    if num >= prime | num < 0 then
        sys.error("%d not in field range 0 to %d" format (num, prime - 1));