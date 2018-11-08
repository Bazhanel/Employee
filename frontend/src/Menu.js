import React, {Component} from 'react'
import {Header, Icon, Menu, Segment, Sidebar, Card, Image} from 'semantic-ui-react'
import {Tab, TabList, TabPanel, TabProvider} from 'react-web-tabs';
import displayTab from './functions'
import 'react-web-tabs/dist/react-web-tabs.css';
import './Tabs.scss'
import './Menu.scss'
export default class SidebarExampleSidebar extends Component {


    handleHideClick = () => this.setState({
        className: 'hided' ,
        side: 'open-sidebar',
        clickSide: this.handleShowClick,
        icons:'closed',});

    handleShowClick = () => this.setState({
        className: 'showed' ,
        side: 'open-sidebar reverse',
        clickSide: this.handleHideClick,
        icons:'opened animate'});

    selectTab = (event) => {
        const tab = event.currentTarget.getAttribute('def');
        displayTab(tab + '-tab');
        this.setState({
            def: tab
        })};
    closeTab = (event) =>{
        const tab = event.target;
        console.log(tab)
    }
    state = {
        def:'two',
        className: 'hided',
        clickSide: this.handleShowClick,
        side: 'open-sidebar',
        icons:'closed',
        profile_icon:"profile"
    }

    render() {
        const {def} = this.state;
        const {className} = this.state;
        const {side} = this.state;
        const {clickSide} = this.state;
        const {icons} = this.state;
        const {profile_icon} = this.state;

        return (
            <div className='wrap'>
                <Sidebar.Pushable
                    className='main'
                    as={Segment}>
                    <Sidebar
                        as={Menu}
                        animation='push'
                        icon='labeled'
                        inverted
                        vertical
                        className={className}
                        visible= {true}
                        width='thin'
                    >
                        <Menu.Item
                            as='a'
                            id='open-bar'
                            onClick={clickSide}
                            className={side}
                            >
                            >
                        </Menu.Item>
                        <Menu.Item
                            def='one'
                            id='profile'
                            as='a'
                            onClick={this.selectTab}
                        >
                                <Card.Content>
                                    <Image
                                        floated='right'
                                        size='small'
                                        src='https://404store.com/2017/12/08/random-pic-14.md.jpg'
                                        circular
                                    />
                                    <Card.Header>Lonely Bot</Card.Header>
                                    <Card.Meta as='a'>Administrator</Card.Meta>

                                </Card.Content>

                            <Icon
                                name='blind'
                                className={icons}
                            />
                            <p className={className}>

                            </p>
                        </Menu.Item>
                        <Menu.Item
                            as='a'
                            id='home'
                            def='two'
                            onClick={this.selectTab}
                        >
                            <Icon
                                name='home'
                                className={icons}
                            />
                            <p
                                className={className}
                            >
                                Штат
                            </p>
                        </Menu.Item>
                        <Menu.Item
                            def='three'
                            id='group'
                            as='a'
                            onClick={this.selectTab}
                        >

                            <Icon
                                name='gamepad'
                                className={icons}
                            />
                            <p
                                className={className}
                            >
                                Групповые тренировки
                            </p>
                        </Menu.Item>
                        <Menu.Item
                            id='notes'
                            def='four'
                            onClick={this.selectTab}
                            as='a'
                        >
                            <Icon
                                name='edit'
                                className={icons}
                            />
                            <p
                                className={className}
                            >Справочник
                            </p>
                        </Menu.Item>
                    </Sidebar>
                    <Sidebar.Pusher>

                        <Segment
                            basic>

                            <Header as='h3'>Application Content</Header>

                            <TabProvider defaultTab={def}>
                                <section className="my-tabs">
                                    <TabList  className="my-tablist">
                                        <Tab tabFor="one" className="my-tab">Профиль<Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                        <Tab tabFor="two">Штат <Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                        <Tab tabFor="three">Гупповые тренировки<Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                        <Tab tabFor="four" className="my-tab">Справочник<Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                    </TabList>



                                    //контент для Табов !!!!!
                                    <div className="wrapper">
                                        <TabPanel tabId="one">
                                            <p>Profile content tab</p>
                                        </TabPanel>
                                        <TabPanel tabId="two">
                                            <p>Tab 1 content</p>
                                        </TabPanel>
                                        <TabPanel tabId="three">
                                            <p>Tab 2 content</p>
                                        </TabPanel>
                                        <TabPanel tabId="four">
                                            <p>Tab 3 content</p>
                                        </TabPanel>
                                    </div>
                                    //



                                </section>
                            </TabProvider>
                        </Segment>
                    </Sidebar.Pusher>
                </Sidebar.Pushable>
            </div>
        )

    }

}
