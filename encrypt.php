<?php
$password = "123456";
$options = [
    'memory_cost' => 65536,
    'time_cost'   => 3,
    'threads'     => 4
];

$hashedPassword = password_hash($password, PASSWORD_ARGON2ID, $options);
echo "Password: ".$hashedPassword;
// Ejemplo: $argon2id$v=19$m=65536,t=3,p=4$c2FtcGxlc2FsdA$ZIH7aVfMeXvp1kOqZzQY4x5mJ9tTSCqQzV2WpLxH3E
?>