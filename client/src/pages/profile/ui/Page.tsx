import qrCodeimage from '@/shared/assets/thread-13090132-506909745012483037.png';
import userProfileImg from '@/shared/assets/thug.jpg';
import '@/shared/ui/shared.scss';
import './styles.scss';
import UserProfileBody from './UserProfileBody';
export const ProfilePage: React.FC = () => {
	// const userProfileQuery = useUserProfile();

	return (
		<UserProfileBody
			firstname='александр'
			lastname='Романов'
			profileImg={userProfileImg}
			qrCodeImg={qrCodeimage}
			username='@friendly_thugg_52_ngg'
		/>
		// <div className='page-wrapper'>
		// 	{userProfileQuery.isLoading ? (
		// 		<div>Loading</div>
		// 	) : userProfileQuery.isError ? (
		// 		<div>Error</div>
		// 	) : userProfileQuery.data ? (
		// 	<UserProfileBody {...userProfileQuery.data}/> когда бек будет готов

		// 	) : (
		// 		<div></div>
		// 	)}
		// </div>
	);
};
