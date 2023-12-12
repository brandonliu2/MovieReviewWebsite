import axios from 'axios';

export default axios.create({
  baseURL: 'https://bd9f-128-189-247-122.ngrok-free.app', // Changed to your local server URL
    headers: {"ngrok-skip-browser-warning": "true"}
  // other configurations (if any)
});