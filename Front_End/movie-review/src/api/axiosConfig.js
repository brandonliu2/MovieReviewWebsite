import axios from 'axios';

export default axios.create({
  baseURL: 'https://ed5b-128-189-245-188.ngrok-free.app', // Changed to your local server URL
    headers: {"ngrok-skip-browser-warning": "true"}
  // other configurations (if any)
});