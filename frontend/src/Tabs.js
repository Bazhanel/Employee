import React from 'react'
import { Tab } from 'semantic-ui-react'
var Index = 2;
function tab1(i) {
   Index = i
}

const panes = [
    { menuItem: 'State', pane:'', render: () => <Tab.Pane>Tab 1 Content</Tab.Pane> },
    { menuItem: 'Group', render: () => <Tab.Pane >Tab 2 Content</Tab.Pane> },
    { menuItem: 'Editor', render: () => <Tab.Pane>Tab 3 Content</Tab.Pane> },
];

const TabExampleBasic = () => <Tab activeIndex={Index} panes={panes} />;
export {tab1}
export default TabExampleBasic