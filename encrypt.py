from argon2 import PasswordHasher

ph = PasswordHasher(
    time_cost=3,       # 3 iteraciones
    memory_cost=65536, # 64MB
    parallelism=4,     # 4 hilos
    hash_len=32,       # 32 bytes
    salt_len=16        # 16 bytes
)

hashed_password = ph.hash("123456")
print(hashed_password)
# Ejemplo: $argon2id$v=19$m=65536,t=3,p=4$c2FtcGxlc2FsdA$ZIH7aVfMeXvp1kOqZzQY4x5mJ9tTSCqQzV2WpLxH3E