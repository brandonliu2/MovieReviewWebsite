import axios from 'axios';

export default axios.create({
  baseURL: 'https://96a2-128-189-245-188.ngrok-free.app', // Changed to your local server URL
    headers: {"ngrok-skip-browser-warning": "true"}
  // other configurations (if any)
});