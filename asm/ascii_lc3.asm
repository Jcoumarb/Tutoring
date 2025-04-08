.ORIG x3000 ; this loops through all ASCII characters

AND R0, R0, #0
ADD R0, R0, #15
ADD R0, R0, #15
ADD R0, R0, #3 ; R0 = 33 (ASCII '!')

LD R2, LAST ; R2 = 127 (last ASCII character)

LOOP 
OUT
ADD R0, R0, #1
NOT R1, R2       ; Take bitwise NOT of R2 (which holds 126)
ADD R1, R1, #1   ; Convert to -127 (two's complement)
ADD R1, R0, R1   ; Compute R0 - 127
BRz END
BR LOOP

END
HALT

LAST .FILL #127

.END
