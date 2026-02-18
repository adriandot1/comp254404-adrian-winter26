class BasicMath:
    def recursion(m, n):
        if n == 0:
            return 0
        else:
            return m + BasicMath.recursion(m, n-1)


print(BasicMath.recursion(3, 3))

