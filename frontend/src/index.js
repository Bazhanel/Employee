import React from 'react';
import ReactDOM from 'react-dom';
import './index.scss';
import App from './App';
import * as serviceWorker from './serviceWorker';
import Menu from "./SidebarMenu";
import Tabs from "./displayTab";

// ReactDOM.render(<App />, document.getElementById('root'));
ReactDOM.render(<Menu />, document.getElementById('leaf'));



serviceWorker.unregister();
