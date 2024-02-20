import axios from 'axios';

export default axios.create({
  baseURL: 'https://ed73-128-189-247-78.ngrok-free.app', // Changed to your local server URL
    headers: {"ngrok-skip-browser-warning": "true"}
  // other configurations (if any)
});