def to_base_n(int_base_10, n):
    residual = int(int_base_10)
    digits = []

    while residual >= n:
        r = residual % n
        digits.append(str(r))
        residual = (residual - r) // n

    digits.append(str(residual))
    return ''.join(digits[::-1])

def to_base_10(int_base_n, n):
    x = list(int_base_n[::-1])
    y_base_10 = 0

    for i, a in enumerate(x):
        y_base_10 += int(a) * (n ** i)
    return str(y_base_10)

def solution(n, b):
    k = len(n)
    m = n
    mini_id = []
    while m not in mini_id:
        mini_id.append(m)
        s = sorted(m)
        x1 = ''.join(s[::-1])
        y1 = ''.join(s)   

        if b == 10:
            int_m = int(x1) - int(y1)
            m = str(int_m)
        else:
            int_m_10 = int(to_base_10(x1, b)) - int(to_base_10(y1, b))
            m = to_base_n(str(int_m_10), b)
        
        m =  (k - len(m)) * '0' + m
    return len(mini_id) - mini_id.index(m)

print(solution('210022', 3))