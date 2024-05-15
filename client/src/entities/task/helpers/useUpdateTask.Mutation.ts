import { taskService } from '@/shared/api/task.service';
import { useMutation } from '@tanstack/react-query';
import { useNavigate } from 'react-router-dom';

export function useUpdateTask() {
	const navigate = useNavigate();
	return useMutation({
		mutationFn: (task_id: number) =>
			taskService.updateTask({ is_done: true, task_id }),
		mutationKey: ['task', 'update'],
		retry: 3,
		onSuccess: () => navigate('/tasks'),
		onError: () => console.log('error'),
	});
}
