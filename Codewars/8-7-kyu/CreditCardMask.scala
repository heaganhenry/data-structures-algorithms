// Your task is to write a function maskify, which changes all but the last four characters of an example credit card number into '#'.

def maskify(cc: String): String =
    "#" * (cc.length - 4) + cc.takeRight(4)