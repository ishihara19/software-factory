/**
 * Archivo: Calculator.jsx
 * Descripción: INterfaz de la calculadora
 * Autor: Fabian Ramos
 * Fecha: 2025-11-05
 * Ultima actualización: N/A
 */

import { useState } from "react";
import {
  Box,
  Button,
  Container,
  TextField,
  Typography,
  Grid,
  Paper,
} from "@mui/material";
import axios from "axios";

export default function Calculator() {
  const [a, setA] = useState("");
  const [b, setB] = useState("");
  const [resultado, setResultado] = useState("");
  const [error, setError] = useState("");

  const baseURL = "http://localhost:8080/api/calculadora";

  const handleOperacion = async (op) => {
    try {
      setError("");
      const response = await axios.get(`${baseURL}/${op}`, {
        params: { a, b },
      });
      setResultado(response.data);
    } catch (err) {
      setError(err.response ? err.response.data : "Error de conexión");
      setResultado("");
    }
  };

  return (
    <Container maxWidth="sm" sx={{ mt: 6 }}>
      <Paper elevation={4} sx={{ p: 4, borderRadius: 3 }}>
        <Typography variant="h4" align="center" gutterBottom>
          🧮 Calculadora REST
        </Typography>

        <Box display="flex" flexDirection="column" gap={2}>
          <TextField
            label="Número A"
            type="number"
            value={a}
            onChange={(e) => setA(e.target.value)}
            fullWidth
          />
          <TextField
            label="Número B"
            type="number"
            value={b}
            onChange={(e) => setB(e.target.value)}
            fullWidth
          />

          <Grid container spacing={2} sx={{ mt: 2 }}>
            {["sumar", "restar", "multiplicar", "dividir"].map((op) => (
              <Grid item xs={6} sm={3} key={op}>
                <Button
                  variant="contained"
                  color="primary"
                  fullWidth
                  onClick={() => handleOperacion(op)}
                >
                  {op.charAt(0).toUpperCase() + op.slice(1)}
                </Button>
              </Grid>
            ))}
          </Grid>

          <Box textAlign="center" mt={3}>
            {resultado !== "" && (
              <Typography variant="h6" color="success.main">
                Resultado: {resultado}
              </Typography>
            )}
            {error && (
              <Typography variant="h6" color="error.main">
                {error}
              </Typography>
            )}
          </Box>
        </Box>
      </Paper>
    </Container>
  );
}
