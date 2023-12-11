import axios from 'axios';

export default axios.create({
  baseURL: 'http://localhost:8080', // Changed to your local server URL
  headers: {"ngrok-skip-browser-warning": "true"}
  // other configurations (if any)
});