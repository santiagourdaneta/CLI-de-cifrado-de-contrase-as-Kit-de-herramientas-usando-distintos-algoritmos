require('dotenv').config(); // Carga variables de entorno
const bcrypt = require('bcrypt');

const saltRounds = parseInt(process.env.BCRYPT_SALT_ROUNDS); // 12
const rawPassword = process.env.DB_PASSWORD || "123456"; // Fallback seguro

bcrypt.hash(rawPassword, saltRounds)
  .then(hashedPassword => {
    console.log("Hash seguro:", hashedPassword);
    // Ejemplo: $2b$12$5H8s6fWz3QzZzZzZzZzZzeXzXzXzXzXzXzXzXzXzXzXzXzXzXzX
  })
  .catch(err => console.error("Error crítico:", err));

 